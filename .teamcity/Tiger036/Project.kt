package Tiger036

import Tiger036.buildTypes.*
import Tiger036.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger036")
    name = "Tiger036"

    vcsRoot(Tiger036_cVCSroot)

    buildType(Tiger036_Hi1)
    buildType(Tiger036_Hi0)
    buildType(Tiger036_Hi3)
    buildType(Tiger036_Hi2)
})
