package Tiger001

import Tiger001.buildTypes.*
import Tiger001.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger001")
    name = "Tiger001"

    vcsRoot(Tiger001_cVCSroot)

    buildType(Tiger001_Hi2)
    buildType(Tiger001_Hi3)
    buildType(Tiger001_Hi0)
    buildType(Tiger001_Hi1)
})
