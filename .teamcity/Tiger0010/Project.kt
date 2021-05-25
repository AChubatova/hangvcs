package Tiger0010

import Tiger0010.buildTypes.*
import Tiger0010.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0010")
    name = "Tiger0010"

    vcsRoot(Tiger0010_cVCSroot)

    buildType(Tiger0010_Hi3)
    buildType(Tiger0010_Hi2)
    buildType(Tiger0010_Hi1)
    buildType(Tiger0010_Hi0)
})
