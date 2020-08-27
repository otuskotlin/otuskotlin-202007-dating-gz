rootProject.name = "otuskotlin-202007-dating"

pluginManagement{
    plugins{
        val kotlinVersion: String by settings
        kotlin("jvm") version kotlinVersion apply false
        kotlin("plugin.serialization") version kotlinVersion apply false
    }
    include("profile-common")
    include("profile-transport-common")
    include("profile-transport-rest")
}