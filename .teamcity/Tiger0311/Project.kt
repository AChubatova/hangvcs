package Tiger0311

import Tiger0311.buildTypes.*
import Tiger0311.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0311")
    name = "Tiger0311"

    vcsRoot(Tiger0311_cVCSroot)

    buildType(Tiger0311_Hi2)
    buildType(Tiger0311_Hi3)
    buildType(Tiger0311_Hi0)
    buildType(Tiger0311_Hi1)
})
