package Tiger0117

import Tiger0117.buildTypes.*
import Tiger0117.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0117")
    name = "Tiger0117"

    vcsRoot(Tiger0117_cVCSroot)

    buildType(Tiger0117_Hi2)
    buildType(Tiger0117_Hi3)
    buildType(Tiger0117_Hi0)
    buildType(Tiger0117_Hi1)
})
