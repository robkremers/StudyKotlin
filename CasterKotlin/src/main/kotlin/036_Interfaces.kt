fun main() {
    // 4:17:52 What interfaces are used for
    // 4:28:51 Real World Interface Example
    // 4:35:39 Anonymous Interfaces Continue here tomorrow.

    /**
     * Main purpose of interfaces:
     * Allows to decouple an application and make for multi-purpose use.
     */
    // Get this from a constructor.
    val fileSystem: FileSystem = getFileSystem()
    fileSystem.readDir()

}

fun getFileSystem(): FileSystem {
    return MemoryFileSystem(listOf("/path/to/file", "/another/path"), "file-contents-go-here")
}

interface FileSystem {
    fun readDir(): List<String>
    fun readFile(): String
}

class Fat32FileSystem : FileSystem {
    override fun readDir(): List<String> {
        return emptyList()
    }

    override fun readFile(): String {
        return ""
    }
}

class ExtFileSystem : FileSystem {
    override fun readDir(): List<String> {
        return emptyList()
    }

    override fun readFile(): String {
        return ""
    }
}

class MemoryFileSystem(val files: List<String>, val fileContents: String): FileSystem {
    override fun readDir(): List<String> {
        return files
    }

    override fun readFile(): String {
        return fileContents
    }
}

