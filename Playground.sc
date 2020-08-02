import java.nio.file.Files

import org.jopendocument.dom.template.JavaScriptTemplate

import scala.io.Source

val resource = Source.fromResource("invoice-jopendoc.odt")

val temp = Files.createTempFile("test", "")

val t = new JavaScriptTemplate(getClass.getResourceAsStream("invoice-jopendoc.odt"))