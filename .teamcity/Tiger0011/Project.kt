package Tiger0011

import Tiger0011.buildTypes.*
import Tiger0011.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0011")
    name = "Tiger0011"

    vcsRoot(Tiger0011_cVCSroot)

    buildType(Tiger0011_Hi2)
    buildType(Tiger0011_Hi1)
    buildType(Tiger0011_Hi3)
    buildType(Tiger0011_Hi0)
})
