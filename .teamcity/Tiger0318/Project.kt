package Tiger0318

import Tiger0318.buildTypes.*
import Tiger0318.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0318")
    name = "Tiger0318"

    vcsRoot(Tiger0318_cVCSroot)

    buildType(Tiger0318_Hi3)
    buildType(Tiger0318_Hi2)
    buildType(Tiger0318_Hi1)
    buildType(Tiger0318_Hi0)
})
