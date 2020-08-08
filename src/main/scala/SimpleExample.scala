// (c) 2020 Naruhiko Ogasawara
// This code is licensed under MIT license (see LICENSE.txt for details)
import java.io.File

import org.jopendocument.dom.template.JavaScriptTemplate

object SimpleExample {
  def main(args: Array[String]): Unit = {
    val template = new JavaScriptTemplate(
      getClass.getResourceAsStream("/invoice-jopendoc.odt"))

    template.setField("fieldCompanyName", "NARUHIKO Security Inc.")
    template.setField("fieldCompanySlogan",
      "Bring Naruhiko's software quality into the Internet")

    val outputFile = new File("output2.odt")
    template.saveAs(outputFile)

  }
}
