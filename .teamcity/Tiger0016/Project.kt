package Tiger0016

import Tiger0016.buildTypes.*
import Tiger0016.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0016")
    name = "Tiger0016"

    vcsRoot(Tiger0016_cVCSroot)

    buildType(Tiger0016_Hi0)
    buildType(Tiger0016_Hi1)
    buildType(Tiger0016_Hi2)
    buildType(Tiger0016_Hi3)
})
