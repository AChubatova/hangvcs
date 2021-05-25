package Tiger009

import Tiger009.buildTypes.*
import Tiger009.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger009")
    name = "Tiger009"

    vcsRoot(Tiger009_cVCSroot)

    buildType(Tiger009_Hi3)
    buildType(Tiger009_Hi2)
    buildType(Tiger009_Hi1)
    buildType(Tiger009_Hi0)
})
