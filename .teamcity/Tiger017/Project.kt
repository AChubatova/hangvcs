package Tiger017

import Tiger017.buildTypes.*
import Tiger017.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger017")
    name = "Tiger017"

    vcsRoot(Tiger017_cVCSroot)

    buildType(Tiger017_Hi0)
    buildType(Tiger017_Hi2)
    buildType(Tiger017_Hi1)
    buildType(Tiger017_Hi3)
})
