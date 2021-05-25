package Tiger010

import Tiger010.buildTypes.*
import Tiger010.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger010")
    name = "Tiger010"

    vcsRoot(Tiger010_cVCSroot)

    buildType(Tiger010_Hi3)
    buildType(Tiger010_Hi2)
    buildType(Tiger010_Hi1)
    buildType(Tiger010_Hi0)
})
