package model

import org.jopendocument.dom.ODSingleXMLDocument
import org.jopendocument.dom.template.JavaScriptTemplate

case class Issue(
                  title: String,
                  abst: String,
                  severity: String
                ) {
  val detailTemplate = new JavaScriptTemplate(
    getClass.getResourceAsStream("/issueDetail.odt"))

  def issueDetailPage(num: Int): ODSingleXMLDocument = {
    detailTemplate.setField("fieldNum", num + 1)
    detailTemplate.setField("fieldIssueTitle", title)
    detailTemplate.setField("fieldAbstract", abst)
    detailTemplate.setField("fieldSeverity", severity)

    detailTemplate.createDocument()
  }
}
