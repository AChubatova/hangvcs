package Tiger014

import Tiger014.buildTypes.*
import Tiger014.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger014")
    name = "Tiger014"

    vcsRoot(Tiger014_cVCSroot)

    buildType(Tiger014_Hi3)
    buildType(Tiger014_Hi2)
    buildType(Tiger014_Hi1)
    buildType(Tiger014_Hi0)
})
