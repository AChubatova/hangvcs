package Tiger019

import Tiger019.buildTypes.*
import Tiger019.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger019")
    name = "Tiger019"

    vcsRoot(Tiger019_cVCSroot)

    buildType(Tiger019_Hi0)
    buildType(Tiger019_Hi2)
    buildType(Tiger019_Hi1)
    buildType(Tiger019_Hi3)
})
