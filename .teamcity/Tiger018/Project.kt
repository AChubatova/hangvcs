package Tiger018

import Tiger018.buildTypes.*
import Tiger018.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger018")
    name = "Tiger018"

    vcsRoot(Tiger018_cVCSroot)

    buildType(Tiger018_Hi3)
    buildType(Tiger018_Hi2)
    buildType(Tiger018_Hi1)
    buildType(Tiger018_Hi0)
})
