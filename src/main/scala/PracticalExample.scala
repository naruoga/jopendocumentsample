// (c) 2020 Naruhiko Ogasawara
// This code is licensed under MIT license (see LICENSE.txt for details)
import java.io.{File, FileOutputStream}

import model.{Issue, Project}

object PracticalExample {
  val project = Project("Naruhiko Inc.", "Naruhiko EC market")

  val issues = List(
    Issue("Your system is broken", "Your system is totally broken", "HIGH"),
    Issue("Your user interface is ugly", "Your user interface is ugly", "LOW")
  )

  def main(args: Array[String]): Unit = {

    // At first, generate the title page then put it on the "doc"
    val doc = project.titlePage
    // Next, iterate all items in "issues", generate detail page then add to "doc"
    for ((issue, i) <- issues.zipWithIndex) doc.add(issue.issueDetailPage(i))

    // Finally output to the file
    val outputFile = new File("output3.odt")
    doc.saveToPackage(new FileOutputStream(outputFile))
  }
}
