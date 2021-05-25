package Tiger026

import Tiger026.buildTypes.*
import Tiger026.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger026")
    name = "Tiger026"

    vcsRoot(Tiger026_cVCSroot)

    buildType(Tiger026_Hi3)
    buildType(Tiger026_Hi0)
    buildType(Tiger026_Hi1)
    buildType(Tiger026_Hi2)
})
