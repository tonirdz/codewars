rootProject.name = "codewars"

val kyudirs = listOf("8-kyu", "7-kyu", "6-kyu")//, "5-kyu", "4-kyu", "3-kyu", "2-kyu", "1-kyu")

kyudirs.forEach { d ->
    File(rootDir, d).walk()
            .maxDepth(1)
            .filter { it.isDirectory && it.name != d }
            .forEach {
                include(":${d}:${it.name}")
                project(":${d}:${it.name}").projectDir = it
            }
}
