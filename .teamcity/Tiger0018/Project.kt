package Tiger0018

import Tiger0018.buildTypes.*
import Tiger0018.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0018")
    name = "Tiger0018"

    vcsRoot(Tiger0018_cVCSroot)

    buildType(Tiger0018_Hi0)
    buildType(Tiger0018_Hi1)
    buildType(Tiger0018_Hi2)
    buildType(Tiger0018_Hi3)
})
