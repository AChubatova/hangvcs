package Tiger0015

import Tiger0015.buildTypes.*
import Tiger0015.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0015")
    name = "Tiger0015"

    vcsRoot(Tiger0015_cVCSroot)

    buildType(Tiger0015_Hi0)
    buildType(Tiger0015_Hi3)
    buildType(Tiger0015_Hi1)
    buildType(Tiger0015_Hi2)
})
