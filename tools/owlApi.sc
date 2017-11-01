/*
  An ad hoc OWL-API-based utility.
 */

import $ivy.`net.sourceforge.owlapi:owlapi-distribution:5.1.2`
import org.semanticweb.owlapi.formats.TurtleDocumentFormat
import org.semanticweb.owlapi.model._
import org.semanticweb.owlapi.apibinding.OWLManager
import org.semanticweb.owlapi.io.FileDocumentSource
import java.io.File
import java.nio.file.Files

object owlApi {
  private val manager: OWLOntologyManager = OWLManager.createOWLOntologyManager

  def loadOntModel(file: File, iri: String): OWLOntology = {
    manager.getIRIMappers.clear() // https://sourceforge.net/p/owlapi/mailman/message/23787202/
    val configurator = new OntologyConfigurator()
      .withUseNamespaceEntities(true)
      .setLoadAnnotationAxioms(false)
      .setStrict(false)
      .setMissingImportHandlingStrategy(MissingImportHandlingStrategy.SILENT)
      .setRetriesToAttempt(0)

    val conf = configurator.buildLoaderConfiguration()
    val docSource = new FileDocumentSource(file)
    manager.loadOntologyFromOntologyDocument(docSource, conf)
  }

  def saveOntModel(base: String, model: OWLOntology, toFile: File,
                   nsPrefixMap: Map[String,String] = Map.empty): Unit = {

    val defaultPrefix = base + "/"

    val turtleFormat = new TurtleDocumentFormat()
    turtleFormat.setDefaultPrefix(defaultPrefix)

    nsPrefixMap foreach { case (prefixName, prefix) ⇒
      //if (prefix != defaultPrefix)
      turtleFormat.setPrefix(prefixName, prefix)
    }

    val out = Files.newOutputStream(toFile.toPath)
    try manager.saveOntology(model, turtleFormat, out)
    finally out.close()
  }
}
