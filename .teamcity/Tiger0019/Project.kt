package Tiger0019

import Tiger0019.buildTypes.*
import Tiger0019.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0019")
    name = "Tiger0019"

    vcsRoot(Tiger0019_cVCSroot)

    buildType(Tiger0019_Hi0)
    buildType(Tiger0019_Hi3)
    buildType(Tiger0019_Hi1)
    buildType(Tiger0019_Hi2)
})
