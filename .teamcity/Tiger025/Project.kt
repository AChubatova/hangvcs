package Tiger025

import Tiger025.buildTypes.*
import Tiger025.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger025")
    name = "Tiger025"

    vcsRoot(Tiger025_cVCSroot)

    buildType(Tiger025_Hi2)
    buildType(Tiger025_Hi3)
    buildType(Tiger025_Hi0)
    buildType(Tiger025_Hi1)
})
