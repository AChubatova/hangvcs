package Tiger0310

import Tiger0310.buildTypes.*
import Tiger0310.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0310")
    name = "Tiger0310"

    vcsRoot(Tiger0310_cVCSroot)

    buildType(Tiger0310_Hi3)
    buildType(Tiger0310_Hi1)
    buildType(Tiger0310_Hi2)
    buildType(Tiger0310_Hi0)
})
