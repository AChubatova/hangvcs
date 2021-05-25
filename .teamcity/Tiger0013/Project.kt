package Tiger0013

import Tiger0013.buildTypes.*
import Tiger0013.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0013")
    name = "Tiger0013"

    vcsRoot(Tiger0013_cVCSroot)

    buildType(Tiger0013_Hi3)
    buildType(Tiger0013_Hi0)
    buildType(Tiger0013_Hi2)
    buildType(Tiger0013_Hi1)
})
