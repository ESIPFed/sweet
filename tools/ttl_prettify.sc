#!/usr/bin/env amm
//
// This Ammonite script reads in SWEET turtle files and generates
// them again "prettified," that is, with blank nodes using the
// `[ ... ]` syntax as supported by OWL-API.
// More in concrete, prettifying is simply loading and saving the
// model in the file, while also retaining the original prefixes
// (which are obtained using Jena).
//
// Use the 'convert' command to generate the result in a file
// with suffix `.owlapi.ttl` (in the same directory), or the
// 'replace' command to overwrite the input file.
//
// USAGE:
//       ./ttl_prettify.sc convert files ...
//       ./ttl_prettify.sc replace files ...
//
// Example: replace all ttl files in some directory:
//       ./ttl_prettify.sc replace path/to/*.ttl
//

@main
def convert(sweets: String*) = doIt(sweets, replace = false)

@main
def replace(sweets: String*) = doIt(sweets, replace = true)

import java.io.File

def doIt(sweets: Seq[String], replace: Boolean) = {
  sweets foreach { sweet ⇒
    val file = new File(sweet)
    if (file.exists())
      prettifyTurtle(file, replace)
    else
      println(s"$file: file not found")
  }
}

import $ivy.`org.slf4j:slf4j-nop:1.7.25`
import $file.jena, jena.jena
import $file.owlApi, owlApi.owlApi

def prettifyTurtle(inFile: File, replace: Boolean) {
  val sweet = inFile.getName.replaceFirst("\\.ttl$", "")
  val iri = s"http://sweetontology.net/$sweet"
  val filename = s"$sweet.ttl"

  // use Jena to get the prefixes:
  val nsPrefixMap = jena.getNsPrefixMap(jena.loadOntModel(inFile, iri))

  println(s"\nprettifying $sweet")
  val outFile = if (replace) inFile
  else new File(inFile.getParentFile, s"$filename.owlapi.ttl")

  // use OWL-API to regenerate the turtle representation:
  println(s"\t- loading $inFile")
  val ont = owlApi.loadOntModel(inFile, iri)
  println(s"\t- saving $outFile")
  owlApi.saveOntModel(iri, ont, outFile, nsPrefixMap)

  if (replace) println(s"\t- $inFile overwritten")
}
