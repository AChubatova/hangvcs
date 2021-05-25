package Tiger008

import Tiger008.buildTypes.*
import Tiger008.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger008")
    name = "Tiger008"

    vcsRoot(Tiger008_cVCSroot)

    buildType(Tiger008_Hi3)
    buildType(Tiger008_Hi2)
    buildType(Tiger008_Hi1)
    buildType(Tiger008_Hi0)
})
