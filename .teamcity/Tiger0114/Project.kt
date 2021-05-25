package Tiger0114

import Tiger0114.buildTypes.*
import Tiger0114.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0114")
    name = "Tiger0114"

    vcsRoot(Tiger0114_cVCSroot)

    buildType(Tiger0114_Hi0)
    buildType(Tiger0114_Hi3)
    buildType(Tiger0114_Hi1)
    buildType(Tiger0114_Hi2)
})
