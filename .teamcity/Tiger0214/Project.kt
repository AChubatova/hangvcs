package Tiger0214

import Tiger0214.buildTypes.*
import Tiger0214.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0214")
    name = "Tiger0214"

    vcsRoot(Tiger0214_cVCSroot)

    buildType(Tiger0214_Hi0)
    buildType(Tiger0214_Hi1)
    buildType(Tiger0214_Hi2)
    buildType(Tiger0214_Hi3)
})
