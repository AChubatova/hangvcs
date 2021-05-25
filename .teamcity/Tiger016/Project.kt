package Tiger016

import Tiger016.buildTypes.*
import Tiger016.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger016")
    name = "Tiger016"

    vcsRoot(Tiger016_cVCSroot)

    buildType(Tiger016_Hi1)
    buildType(Tiger016_Hi0)
    buildType(Tiger016_Hi3)
    buildType(Tiger016_Hi2)
})
