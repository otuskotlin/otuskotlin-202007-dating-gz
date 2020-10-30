rootProject.name = "ok-202007-dating-gz1"

pluginManagement{
    plugins{
        val kotlinVersion: String by settings

        kotlin("multiplatform") version kotlinVersion apply false
        kotlin("jvm") version kotlinVersion apply false
        kotlin("plugin.serialization") version kotlinVersion apply false
    }
}

include("ok-dating-be-common")