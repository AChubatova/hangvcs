package Tiger004

import Tiger004.buildTypes.*
import Tiger004.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger004")
    name = "Tiger004"

    vcsRoot(Tiger004_cVCSroot)

    buildType(Tiger004_Hi1)
    buildType(Tiger004_Hi2)
    buildType(Tiger004_Hi0)
    buildType(Tiger004_Hi3)
})
