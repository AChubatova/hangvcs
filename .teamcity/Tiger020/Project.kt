package Tiger020

import Tiger020.buildTypes.*
import Tiger020.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger020")
    name = "Tiger020"

    vcsRoot(Tiger020_cVCSroot)

    buildType(Tiger020_Hi3)
    buildType(Tiger020_Hi2)
    buildType(Tiger020_Hi1)
    buildType(Tiger020_Hi0)
})
