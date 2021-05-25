package Tiger022

import Tiger022.buildTypes.*
import Tiger022.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger022")
    name = "Tiger022"

    vcsRoot(Tiger022_cVCSroot)

    buildType(Tiger022_Hi3)
    buildType(Tiger022_Hi0)
    buildType(Tiger022_Hi1)
    buildType(Tiger022_Hi2)
})
