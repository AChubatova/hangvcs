package Tiger0017

import Tiger0017.buildTypes.*
import Tiger0017.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0017")
    name = "Tiger0017"

    vcsRoot(Tiger0017_cVCSroot)

    buildType(Tiger0017_Hi1)
    buildType(Tiger0017_Hi2)
    buildType(Tiger0017_Hi0)
    buildType(Tiger0017_Hi3)
})
