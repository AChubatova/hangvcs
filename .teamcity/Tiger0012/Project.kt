package Tiger0012

import Tiger0012.buildTypes.*
import Tiger0012.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0012")
    name = "Tiger0012"

    vcsRoot(Tiger0012_cVCSroot)

    buildType(Tiger0012_Hi3)
    buildType(Tiger0012_Hi2)
    buildType(Tiger0012_Hi1)
    buildType(Tiger0012_Hi0)
})
