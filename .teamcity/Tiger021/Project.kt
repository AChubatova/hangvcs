package Tiger021

import Tiger021.buildTypes.*
import Tiger021.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger021")
    name = "Tiger021"

    vcsRoot(Tiger021_cVCSroot)

    buildType(Tiger021_Hi2)
    buildType(Tiger021_Hi3)
    buildType(Tiger021_Hi0)
    buildType(Tiger021_Hi1)
})
