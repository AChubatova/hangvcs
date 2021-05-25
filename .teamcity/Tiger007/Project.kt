package Tiger007

import Tiger007.buildTypes.*
import Tiger007.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger007")
    name = "Tiger007"

    vcsRoot(Tiger007_cVCSroot)

    buildType(Tiger007_Hi0)
    buildType(Tiger007_Hi1)
    buildType(Tiger007_Hi2)
    buildType(Tiger007_Hi3)
})
