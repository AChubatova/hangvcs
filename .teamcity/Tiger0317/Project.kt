package Tiger0317

import Tiger0317.buildTypes.*
import Tiger0317.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0317")
    name = "Tiger0317"

    vcsRoot(Tiger0317_cVCSroot)

    buildType(Tiger0317_Hi0)
    buildType(Tiger0317_Hi1)
    buildType(Tiger0317_Hi2)
    buildType(Tiger0317_Hi3)
})
