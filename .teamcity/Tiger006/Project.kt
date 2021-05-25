package Tiger006

import Tiger006.buildTypes.*
import Tiger006.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger006")
    name = "Tiger006"

    vcsRoot(Tiger006_cVCSroot)

    buildType(Tiger006_Hi0)
    buildType(Tiger006_Hi3)
    buildType(Tiger006_Hi1)
    buildType(Tiger006_Hi2)
})
