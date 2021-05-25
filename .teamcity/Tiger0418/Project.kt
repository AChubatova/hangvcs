package Tiger0418

import Tiger0418.buildTypes.*
import Tiger0418.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0418")
    name = "Tiger0418"

    vcsRoot(Tiger0418_cVCSroot)

    buildType(Tiger0418_Hi3)
    buildType(Tiger0418_Hi2)
    buildType(Tiger0418_Hi1)
    buildType(Tiger0418_Hi0)
})
