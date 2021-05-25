package Tiger013

import Tiger013.buildTypes.*
import Tiger013.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger013")
    name = "Tiger013"

    vcsRoot(Tiger013_cVCSroot)

    buildType(Tiger013_Hi2)
    buildType(Tiger013_Hi1)
    buildType(Tiger013_Hi3)
    buildType(Tiger013_Hi0)
})
