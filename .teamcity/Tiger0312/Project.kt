package Tiger0312

import Tiger0312.buildTypes.*
import Tiger0312.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0312")
    name = "Tiger0312"

    vcsRoot(Tiger0312_cVCSroot)

    buildType(Tiger0312_Hi0)
    buildType(Tiger0312_Hi3)
    buildType(Tiger0312_Hi1)
    buildType(Tiger0312_Hi2)
})
