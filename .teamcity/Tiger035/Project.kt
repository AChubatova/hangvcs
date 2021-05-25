package Tiger035

import Tiger035.buildTypes.*
import Tiger035.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger035")
    name = "Tiger035"

    vcsRoot(Tiger035_cVCSroot)

    buildType(Tiger035_Hi0)
    buildType(Tiger035_Hi3)
    buildType(Tiger035_Hi2)
    buildType(Tiger035_Hi1)
})
