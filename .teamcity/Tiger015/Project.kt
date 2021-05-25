package Tiger015

import Tiger015.buildTypes.*
import Tiger015.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger015")
    name = "Tiger015"

    vcsRoot(Tiger015_cVCSroot)

    buildType(Tiger015_Hi3)
    buildType(Tiger015_Hi0)
    buildType(Tiger015_Hi2)
    buildType(Tiger015_Hi1)
})
