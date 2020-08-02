package model

import org.jopendocument.dom.ODSingleXMLDocument
import org.jopendocument.dom.template.JavaScriptTemplate

case class Project(
                    customer: String,
                    systemName: String,
                  ) {
  val titleTemplate = new JavaScriptTemplate(
    getClass.getResourceAsStream("/title.odt"))
  def titlePage: ODSingleXMLDocument = {
    titleTemplate.setField("fieldCustomer", customer)
    titleTemplate.setField("fieldSystem", systemName)

    titleTemplate.createDocument()
  }
}
