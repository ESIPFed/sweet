/*
  An ad hoc Jena-based utility.
 */

import $ivy.`org.apache.jena:jena:3.2.0`
import $ivy.`org.apache.jena:jena-tdb:3.2.0`
import org.apache.jena.ontology.{OntDocumentManager, OntModel, OntModelSpec}
import org.apache.jena.rdf.model.ModelFactory
import java.io.{File, FileInputStream}

object jena {
  def loadOntModel(file: File, iri: String): OntModel = {
    val spec = new OntModelSpec(OntModelSpec.OWL_MEM)
    spec.setDocumentManager(new OntDocumentManager)
    val model: OntModel = ModelFactory.createOntologyModel(spec, null)
    model.setDynamicImports(false)
    model.getDocumentManager.setProcessImports(false)
    val lang = if (file.getName.endsWith(".ttl")) "TTL" else "RDF/XML"
    val is = new FileInputStream(file)
    try model.read(is, iri, lang)
    finally is.close()
    model
  }

  def getNsPrefixMap(ont: OntModel): Map[String,String] = {
    import collection.JavaConverters._
    ont.getNsPrefixMap.asScala.toMap
  }
}
