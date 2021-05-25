package Tiger0315

import Tiger0315.buildTypes.*
import Tiger0315.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0315")
    name = "Tiger0315"

    vcsRoot(Tiger0315_cVCSroot)

    buildType(Tiger0315_Hi2)
    buildType(Tiger0315_Hi3)
    buildType(Tiger0315_Hi0)
    buildType(Tiger0315_Hi1)
})
