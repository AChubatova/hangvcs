package Tiger030

import Tiger030.buildTypes.*
import Tiger030.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger030")
    name = "Tiger030"

    vcsRoot(Tiger030_cVCSroot)

    buildType(Tiger030_Hi0)
    buildType(Tiger030_Hi1)
    buildType(Tiger030_Hi2)
    buildType(Tiger030_Hi3)
})
