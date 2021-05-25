package Tiger023

import Tiger023.buildTypes.*
import Tiger023.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger023")
    name = "Tiger023"

    vcsRoot(Tiger023_cVCSroot)

    buildType(Tiger023_Hi0)
    buildType(Tiger023_Hi1)
    buildType(Tiger023_Hi2)
    buildType(Tiger023_Hi3)
})
