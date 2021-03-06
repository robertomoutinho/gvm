package gvm


class TestUtils {

    static final DEFAULT_BASE_DIR = "/tmp/base"

    static File prepareBaseDir() {
        def counter = "${(Math.random() * 10000).toInteger()}".padLeft(4, "0")
        def baseDir = "$DEFAULT_BASE_DIR/gvm-$counter" as File
        baseDir.mkdirs()
        baseDir
    }
}
