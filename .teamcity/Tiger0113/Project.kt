package Tiger0113

import Tiger0113.buildTypes.*
import Tiger0113.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0113")
    name = "Tiger0113"

    vcsRoot(Tiger0113_cVCSroot)

    buildType(Tiger0113_Hi2)
    buildType(Tiger0113_Hi3)
    buildType(Tiger0113_Hi0)
    buildType(Tiger0113_Hi1)
})
