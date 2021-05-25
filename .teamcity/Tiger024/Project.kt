package Tiger024

import Tiger024.buildTypes.*
import Tiger024.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger024")
    name = "Tiger024"

    vcsRoot(Tiger024_cVCSroot)

    buildType(Tiger024_Hi0)
    buildType(Tiger024_Hi1)
    buildType(Tiger024_Hi2)
    buildType(Tiger024_Hi3)
})
